#!/usr/bin/env groovy
def status1(String jobName,String buildNumber,String stageName) {
  //echo "shared_library"
  //echo "Hello, ${name}."
  //slackSend (color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' SUCCESS")
  slackSend (color: '#FFFF00', message: "${stageName}: Job '${jobName} ${[buildNumber]}' 'SUCCESS'")
}

def status2(String jobName,String buildNumber,String stageName) {
  //echo "shared_library"
  //echo "Hello, ${name}."
  //slackSend (color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' SUCCESS")
  slackSend (color: '#FFFF00', message: "${stageName}: Job '${jobName} ${[buildNumber]}' 'FAILURE'")
}

