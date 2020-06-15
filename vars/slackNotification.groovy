def call(String jobName,String buildNumber,StringbuildStatus) {
  //echo "Hello, ${name}."
  //slackSend (color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' SUCCESS")
  slackSend (color: '#FFFF00', message: "STARTED: Job '${jobName} ${[buildNumber]}' ${buildStatus}")
}
