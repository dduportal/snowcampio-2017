import jenkins.model.*
import hudson.model.*
import hudson.security.*

def instance = Jenkins.getInstance()
//
// def strategy = new ProjectMatrixAuthorizationStrategy()
//
// strategy.add(Jenkins.ADMINISTER, "dduportal")
// strategy.add(Jenkins.READ, "vfarcic")
// strategy.add(Jenkins.READ, "elong")
// strategy.add(Jenkins.READ, "bfohl-cb")
// strategy.add(Jenkins.READ, "brentmcconnell")
// strategy.add(Jenkins.READ, "schottsfired")
//
// if(!strategy.equals(instance.getSecurityRealm())) {
//     instance.setAuthorizationStrategy(strategy)
//     instance.save()
// }
