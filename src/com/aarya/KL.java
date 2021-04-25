package com.aarya;

import java.awt.event.KeyAdapter;

/**
 * Key Listener
 */
public class KL extends KeyAdapter {

    private static KL INSTANCE;

    public static synchronized KL getInstance() {
        if(KL.INSTANCE == null) { KL.INSTANCE = new KL(); }
        return KL.INSTANCE;
    }
}
