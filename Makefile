
BOX_FILE := alpine2docker/snowcampio-2017.box
GIT_SUBPROJECT := alpine2docker
CUSTOMIZE_DIR := $(GIT_SUBPROJECT)/customize
TMP_LAB_DIR := ./tmp-lab

all: clean-lab lab

clean: clean-lab clean-box

lab: clean-lab init-lab start-lab

box: clean-box build-box

build-box: $(BOX_FILE)

$(BOX_FILE):
	cp -r ./lab/ ./$(GIT_SUBPROJECT)/customize
	cp ./lab/vagrantfile-box.tpl ./$(GIT_SUBPROJECT)/
	cd $(GIT_SUBPROJECT) && make all

init-lab:
	vagrant box add --force snowcamp-lab ./alpine2docker/alpine2docker-1.0.0.box
	mkdir -p $(TMP_LAB_DIR)
	cd $(TMP_LAB_DIR) && vagrant init -m -f snowcamp-lab

start-lab:
	cd $(TMP_LAB_DIR) && vagrant up

suspend-lab:
	cd $(TMP_LAB_DIR) && vagrant suspend

clean-lab:
	cd $(TMP_LAB_DIR) && vagrant destroy -f || true
	rm -rf $(TMP_LAB_DIR)
	vagrant global-status --prune

clean-box:
	rm -rf $(BOX_FILE) $(CUSTOMIZE_DIR)
	cd $(GIT_SUBPROJECT) && git checkout .

.PHONY: all lab box clean build-box clean-box start-lab clean-lab suspend-lab
