require 'buildr/git_auto_version'
require 'buildr/gpg'

desc 'Geolatte-Eclipselink Converters'
define 'geolatte-geom-eclipselink' do
  project.group = 'org.realityforge.jeo.geolatte.jpa.eclipselink'

  compile.options.source = '1.6'
  compile.options.target = '1.6'
  compile.options.lint = 'all'

  pom.add_apache_v2_license
  pom.add_github_project('realityforge/geolatte-geom-eclipselink')
  pom.add_developer('realityforge', 'Peter Donald')
  pom.provided_dependencies.concat [:javax_persistence, :eclipselink]
  pom.optional_dependencies.concat [:postgresql, :postgis_jdbc]

  compile.with :javax_persistence,
               :eclipselink,
               :geolatte_geom,
               :postgresql,
               :postgis_jdbc

  test.using :testng, :excludegroups => ['sqlserver']

  test.with :jts,
            :slf4j_api,
            :jtds,
            :slf4j_jdk14

  package :jar
  package :sources
  package :javadoc
end
