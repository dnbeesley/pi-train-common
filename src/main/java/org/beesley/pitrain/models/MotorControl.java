package org.beesley.pitrain.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The class for a motor control unit on the layout.
 */
@Entity
@Table(name = "MOTOR_CONTROL")
public class MotorControl {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "CHANNEL")
  private byte channel;

  @Column(name = "IS_REVERSED")
  private boolean isReversed;

  @Column(name = "SPEED")
  private short speed;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public byte getChannel() {
    return this.channel;
  }

  public void setChannel(byte channel) {
    this.channel = channel;
  }

  public boolean isReversed() {
    return isReversed;
  }

  public void setReversed(boolean isReversed) {
    this.isReversed = isReversed;
  }

  public short getSpeed() {
    return speed;
  }

  public void setSpeed(short speed) {
    this.speed = speed;
  }
}
