package net.craswell.common.models;

import javax.persistence.Entity;

/**
 * Model a basic name-value pair used for configurations.
 * 
 * @author scraswell@gmail.com
 *
 */
@Entity
public class ConfigurationItem
  extends Model {
  /**
   * The configuration item name. 
   */
  private String name;
  
  /**
   * The configuration item value.
   */
  private String value;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(String value) {
    this.value = value;
  }
}
