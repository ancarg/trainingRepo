import groovy.json.JsonSlurper
import groovy.json.*
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

def jsonSlurper2 = new JsonSlurper()

//update the filepath with the path of your job.

def jobs = new BufferedReader(new InputStreamReader(new FileInputStream( "/var/lib/jenkins/workspace/testSeedJob/generateSeedJobs.json"),"UTF-8"))
data2 = jsonSlurper2.parse(jobs)
def allSJObs = data2.jobs as Object
data2.jobs.each
  {
    println("Create Job $it.moduleName")

// here starts create the job
    job("$it.moduleName") {
        description(' This is the Description of the job.')
  
        logRotator(5, 100, -1, -1)
        label('master')
    steps {
      shell('echo clone repository $it.repositoryName')
      shell('echo build module $it.moduleName')
      shell('echo store result in $it.storeLocation')
      //shell('echo send email notifications to $it.emailingList')
      }
    }

    ////////////here ends create the job
  }
