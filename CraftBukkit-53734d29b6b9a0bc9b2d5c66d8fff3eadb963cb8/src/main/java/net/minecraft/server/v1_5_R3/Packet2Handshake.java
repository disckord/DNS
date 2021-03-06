package net.minecraft.server.v1_5_R3;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException; // CraftBukkit

public class Packet2Handshake extends Packet {

    private int a;
    private String b;
    public String c; // CraftBukkit private -> public
    public int d; // CraftBukkit private -> public
    public int h;

    public Packet2Handshake() {}

    public void a(DataInputStream datainputstream) throws IOException { // CraftBukkit - throws IOException
        this.a = datainputstream.readInt();
        this.b = a(datainputstream, 16);
        this.c = a(datainputstream, 255);
        this.d = datainputstream.readInt();
        this.h = datainputstream.readInt();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException { // CraftBukkit - throws IOException
        dataoutputstream.writeInt(this.a);
        a(this.b, dataoutputstream);
        a(this.c, dataoutputstream);
        dataoutputstream.writeInt(this.d);
        dataoutputstream.writeInt(this.h);
    }

    public void handle(Connection connection) {
        connection.a(this);
    }

    public int a() {
        return 4 + 2 * this.b.length();
    }

    public int g()
    {
    	return this.h;
    }
    public int d() {
        return this.a;
    }

    public String f() {
        return this.b;
    }
}
