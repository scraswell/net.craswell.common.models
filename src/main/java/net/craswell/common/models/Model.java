package net.craswell.common.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The base model from which all models will be derived.
 * 
 * @author scraswell@gmail.com
 *
 */
@Entity
public abstract class Model {
  /**
   * The model identifier.
   */
  @Id
  @GeneratedValue
  private UUID id;

  /**
   * @return the id
   */
  public UUID getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(UUID id) {
    this.id = id;
  }
}
