package org.realityforge.jeo.geolatte.jpa.eclipselink;

import org.testng.annotations.Test;

public final class SqlServerGeolatteExtensionTest
  extends AbstractGeolatteExtensionTest
{
  @Override
  protected boolean isPostgres()
  {
    return false;
  }

  @Test( groups = "sqlserver" )
  public void basic()
    throws Exception
  {
    performTests();
  }
}
