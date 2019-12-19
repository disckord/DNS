package net.minecraft.server.v1_5_R3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Packet63WorldParticles extends Packet {

    private String type;
    private float x;
    private float y;
    private float z;
    private float vx;
    private float vy;
    private float vz;
    private float speed;
    private int quantity;
    public Packet63WorldParticles(){}
    public Packet63WorldParticles(String type, double x, double y, double z, double vx, double vy, double vz) 
    {
    	this.type = type;
    	this.x = (float) x;
    	this.y = (float) y;
    	this.z = (float) z;
    	this.vx = (float) vx;
    	this.vy = (float) vy;
    	this.vz = (float) vz;
    }

    public void a(DataInputStream datainputstream) throws IOException {
        this.type = a(datainputstream, 64);
        this.x = datainputstream.readFloat();
        this.y = datainputstream.readFloat();
        this.z = datainputstream.readFloat();
        this.vx = datainputstream.readFloat();
        this.vy = datainputstream.readFloat();
        this.vz = datainputstream.readFloat();
        this.speed = datainputstream.readFloat();
        this.quantity = datainputstream.readInt();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException {
        a(this.type, dataoutputstream);
        dataoutputstream.writeFloat(this.x);
        dataoutputstream.writeFloat(this.y);
        dataoutputstream.writeFloat(this.z);
        dataoutputstream.writeFloat(this.vx);
        dataoutputstream.writeFloat(this.vy);
        dataoutputstream.writeFloat(this.vz);
        dataoutputstream.writeFloat(this.speed);
        dataoutputstream.writeInt(this.quantity);
    }
    public String getParticleName()
    {
        return this.type;
    }

    /**
     * Gets the X position of the particle.
     */
    public double getPositionX()
    {
        return (double)this.x;
    }

    /**
     * Gets the Y position of the particle.
     */
    public double getPositionY()
    {
        return (double)this.y;
    }

    /**
     * Gets the Z position of the particle.
     */
    public double getPositionZ()
    {
        return (double)this.z;
    }

    /**
     * This is added to the X position after being multiplied by random.nextGaussian()
     */
    public float getOffsetX()
    {
        return this.vx;
    }

    /**
     * This is added to the Y position after being multiplied by random.nextGaussian()
     */
    public float getOffsetY()
    {
        return this.vy;
    }

    /**
     * This is added to the Z position after being multiplied by random.nextGaussian()
     */
    public float getOffsetZ()
    {
        return this.vz;
    }

    /**
     * Gets the speed of the particles.
     */
    public float getSpeed()
    {
        return this.speed;
    }

    /**
     * Gets the number of particles to create.
     */
    public int getQuantity()
    {
        return this.quantity;
    }

    public void handle(Connection connection) {
        connection.a(this);
    }

    public int a() {
        return 64;
    }
}