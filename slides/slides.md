Titre: snowcamp-io-2017-batissons-ensemble-un-pipeline-avec-jenkins-et-docker
name: normal
layout: true
---
class: center, middle, inverse
# SnowCamp IO 2017:
## Bâtissons ensemble un pipeline avec Jenkins et Docker

---

# Whoami :

* Damien DUPORTAL
  - Training Engineer @ [CloudBees](https://www.cloudbees.com) depuis 1 an
  - 6 ans à [Atos Worldline](http://worldline.com/fr/accueil.html): Production, Dev, Training, etc.
  - Intervenant ponctuel à [EPSI](http://www.epsi.fr/), [ENSG](http://www.ensg.eu/), [CNAM](http://www.cnam.fr/)
  - Docker mentor, depuis v0.3
  - Grimpeur

<img alt="Damien" src="./images/damien-duportal.jpg" width="30%" align="right"/>

* Contact:
  - Mail/Hangouts: <damien.duportal@gmail.com>
  - Professionel: <dduportal@cloudbees.com>
  - Github: [dduportal](https://github.com/dduportal)
  - Twitter: [@DamienDuportal](https://twitter.com/DamienDuportal)

---
class: center, middle, inverse
# Who are you ?

---

# Agenda:

1. Jenkins 2, quoi de neuf ?
2. Un petit tour du propriétaire
3. Vous avez dit Docker ?
4. Un petit pipeline pour commencer
5. Jenkins et Docker ensemble


---
class: center, middle, inverse

# Jenkins 2, quoi de neuf ?

<br />
<img alt="Jenkins 2.0" src="./images/jenkins-2.0.jpg" width="30%" />


---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
]
.right-column[

# Pourquoi Jenkins 2 ?

* Jenkins 1 a(vait) + 10ans
    - 1.658:
        + acegi-security:1.0.7 — Avril 2008
        + spring-core:2.5.6 — Octobre 2008

* Parce que l’intégration continue a évolué
  - jenkins-ci.org !?

* slave ➞ agent

* "Fire and forget"

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
]
.right-column[

# Objectifs

* **Message:** CI -> CD
  - CD = Continuous Delivery

.center[
<img alt="cd-vs-cd"
    src="./images/continuous-depl-vs-delivery.jpg"
    width="70%" />
]
* Transition douce: Pas de rupture avec Jenkins 1
  - Montée de version simple
  - Tous les plugins restent compatible (~)

* Expérience première utilisation

* **Pipeline-as-Code** en première ligne

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
]
.right-column[
# Assistant

.center[
<img alt="wizard-security"
    src="./images/wizard-security.png"
    width="100%" />
]

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
]
.right-column[
# Assistant

.center[
<img alt="wizard-plugins"
    src="./images/wizard-plugins.png"
    width="100%" />
]

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
]
.right-column[
# Assistant

.center[
<img alt="wizard-plugins-custom"
    src="./images/wizard-plugins-custom.png"
    width="100%" />
]

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
]
.right-column[
# Assistant

.center[
<img alt="wizard-plugins-recommended"
    src="./images/wizard-plugins-recommended.png"
    width="100%" />
]

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
]
.right-column[
# Assistant

.center[
<img alt="wizard-admin"
    src="./images/wizard-admin.png"
    width="100%" />
]

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
]
.right-column[
# Pipeline
]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
]
.right-column[
# \*.jenkins.io

.center[
<img alt="jenkins.io" src="./images/jenkins.io.png" width="100%" />
<https://jenkins.io>
]



* Moderne
* Collaboratif
* Documentation et tutoriels

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
]
.right-column[
# \*.jenkins.io

* Avez-vous déjà essayé de chercher un plugin ?
* ... une documentation de plugin ?

.center[
## Tout nouveau, tout beau:
<img alt="plugins.jenkins.io" src="./images/plugins.jenkins.io.png" width="100%" />
<https://plugins.jenkins.io>]

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
## Futur: Backend Storage
]
.right-column[
# Futur: Backend Storage

.center[![Butler Devil](./images/butler-devil.png)]
]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
## Futur: Backend Storage
## Futur: BlueOcean
]
.right-column[
# Futur: BlueOcean

.center[
<img alt="BlueOcean 1" src="./images/bo-1.png" width="100%"/>
<https://jenkins.io/projects/blueocean/>
]

* Repenser l'expérience **utilisateur** de Jenkins
* Nouvelle IHM écrite en [ReactJS](https://facebook.github.io/react/)
* Conçu pour les **Pipelines** (compatible Freestyle)

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
## Futur: Backend Storage
## Futur: BlueOcean
]
.right-column[
# Futur: BlueOcean

.center[
<img alt="BlueOcean 2" src="./images/bo-2.png" width="100%"/>
]

* Visualiser son Pipeline
* Etapes, logs, métriques, statut

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
## Futur: Backend Storage
## Futur: BlueOcean
]
.right-column[
# Futur: BlueOcean

.center[
<img alt="BlueOcean 3" src="./images/bo-3.png" width="100%"/>
]

* Identifier immédiatement les problèmes
* Retour d'information **rapide**

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
## Futur: Backend Storage
## Futur: BlueOcean
]
.right-column[
# Futur: BlueOcean

.center[
<img alt="BlueOcean 4" src="./images/bo-4.png" width="100%"/>
]

* Personnalisation de son interface

]
---
.left-column[
# Jenkins 2, quoi de neuf ?
## Pourquoi Jenkins 2 ?
## Objectifs
## Assistant
## Pipeline
## \*.jenkins.io
## Futur: Backend Storage
## Futur: BlueOcean
]
.right-column[
# Futur: BlueOcean

.center[
<img alt="BlueOcean 5" src="./images/bo-5.png" width="100%"/>
]

* Gestion native des branches, pull-requests
* Compatible Github et Bitbucket APIs (feedbacks)

]
---
class: center, middle, inverse

# Un petit tour du propriétaire
---
.left-column[
# Un petit tour du propriétaire
## Game Of Life
]
.right-column[

# Game Of Life

]
---
.left-column[
# Un petit tour du propriétaire
## Game Of Life
## Maven & Java
]
.right-column[

# Maven & Java

]
---
.left-column[
# Un petit tour du propriétaire
## Game Of Life
## Maven & Java
## Run It
]
.right-column[

# Run It

]
---
class: center, middle, inverse

# Vous avez dit Docker ?
---
.left-column[
# Vous avez dit Docker ?
##
]
.right-column[

#

]
---
class: center, middle, inverse

# Un petit pipeline pour commencer
---
.left-column[
# Un petit pipeline pour commencer
##
]
.right-column[

#

]
---
class: center, middle, inverse

# Jenkins et Docker ensemble
---
.left-column[
# Jenkins et Docker ensemble
##
]
.right-column[

#

]
---
class: center, middle, inverse
# Merci !
## Questions ?
