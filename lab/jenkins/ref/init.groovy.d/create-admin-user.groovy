import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("admin","snowcampio2017")
instance.setSecurityRealm(hudsonRealm)
instance.save()
