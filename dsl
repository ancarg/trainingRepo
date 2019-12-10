job('simpleTriggerCreatedFromGit'){
  parameters{
  stringParam('Module1','Module1','Description of this param')
  }
steps {
  shell('echo $JOB_NAME - $BUILD_NUMBER')
  shell('echo $Module1')
 }
  publishers{
    downstream('testVariables', 'SUCCESS')
  }
}
