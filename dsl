job('simpleTriggerCreatedFromGit'){
  parameters{
  stringParam('Module','Undescribed','Description of this param')
  }
steps {
  shell('echo $JOB_NAME - $BUILD_NUMBER')
  shell('echo $Module')
 }
  publishers{
    downstream('testEmail', 'SUCCESS')
  }
}
