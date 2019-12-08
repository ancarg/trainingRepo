import groovy.json.JsonSlurper
import groovy.json.*
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

for(i=1;i<=10;i++){
  job("job-$i") {
    steps{
      shell("echo $MODULE_NAME was selected in the seed job")
      shell('echo $JOB_NAME')

    }
  } 
}

