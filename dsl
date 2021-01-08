job('simpleTriggerCreatedFromGit'){
  parameters{
  stringParam('Object','Module1','Description of this param')
  }
steps {
  shell('echo $JOB_NAME - $BUILD_NUMBER')
  shell('echo $Object')
 }
  publishers{
    downstream('envVar', 'SUCCESS')
  }
}
