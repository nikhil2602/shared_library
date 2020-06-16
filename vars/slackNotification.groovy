#!/usr/bin/env groovy
def call(String jobName,String buildNumber,String buildStatus,String stageName) {
  //echo "shared_library"
  //echo "Hello, ${name}."
  //slackSend (color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' SUCCESS")
  slackSend (color: '#FFFF00', message: "${stageName}: Job '${jobName} ${[buildNumber]}' ${buildStatus}")
}

