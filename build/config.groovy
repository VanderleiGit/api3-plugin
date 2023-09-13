
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '0.1')
        classNode.putNodeMetaData('projectName', 'api3-plugin')
        classNode.putNodeMetaData('isPlugin', 'true')
        compile ":rest-client-builder:2.0.0"
        compile 'org.grails:grails-datastore-rest-client'
    }
}
