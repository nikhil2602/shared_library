def call(Map stageParams) {
checkout([
  $class: 'GitSCM', 
  branches: [[name: '*/master']],
  userRemoteConfigs: [[url: 'https://github.com/nikhil2602/shared_library.git']]])
}

