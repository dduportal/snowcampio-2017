
BOX_FILE := alpine2docker/snowcampio-2017.box
GIT_SUBPROJECT := alpine2docker
CUSTOMIZE_DIR := $(GIT_SUBPROJECT)/customize

all: clean-lab lab

lab: $(BOX_FILE)

$(BOX_FILE):
	cp -r ./lab/customize ./$(GIT_SUBPROJECT)/
	cd $(GIT_SUBPROJECT) && make all

clean-lab:
	rm -rf $(BOX_FILE) $(CUSTOMIZE_DIR)
	cd $(GIT_SUBPROJECT) && git checkout .

.PHONY: box prepare-test test all clean clean-test clean-box
