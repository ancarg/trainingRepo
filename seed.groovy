import groovy.json.JsonSlurper
import groovy.json.*
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

def jsonSlurper2 = new JsonSlurper()

//update the filepath with the path of your job.

def jobs = new BufferedReader(new InputStreamReader(new FileInputStream( "/var/lib/jenkins/workspace/SeedJob/seed.json"),"UTF-8"))
data2 = jsonSlurper2.parse(jobs)
def allSJObs = data2.jobs as Object
data2.jobs.each
  {
    println("Create Job $it.repositoryName")

    for(i=1;i<=10;i++){
      job("job->$i") {
        steps{
          shell('echo $JOB_NAME')
        
        }
    } 
  }
}
