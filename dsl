job('simpleTrigger2'){
  parameters{
  stringParam('Object','Undescribed','Description of this param')
  }
steps {
  shell('echo $JOB_NAME - $BUILD_NUMBER')
  shell('echo $Object')
 }
  publishers{
    downstream('simpleJobWithParameter', 'SUCCESS')
  }
}
