package org.realityforge.jeo.geolatte.jpa.eclipselink;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.geolatte.geom.LineString;
import org.geolatte.geom.MultiLineString;

@Entity
public class TestMultiLineStringEntity
  implements Serializable
{
  @Id
  @Column( name = "id" )
  private Integer _id;

  @Column( name = "geom" )
  private MultiLineString _geom;

  public Integer getId()
  {
    return _id;
  }

  public void setId( final Integer id )
  {
    _id = id;
  }

  public MultiLineString getGeom()
  {
    return _geom;
  }

  public void setGeom( final MultiLineString geom )
  {
    _geom = geom;
  }
}
