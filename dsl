job('simpleTriggerCreatedFromGit'){
  parameters{
  stringParam('Module','Module1','Description of this param')
  }
steps {
  shell('echo $JOB_NAME - $BUILD_NUMBER')
  shell('echo $Module')
 }
  publishers{
    downstream('testVariables', 'SUCCESS')
  }
}
