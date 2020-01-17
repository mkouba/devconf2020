package org.acme.watcher;

import org.jboss.logging.Logger;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class WatcherRecorder {

    private static final Logger LOGGER = Logger.getLogger("org.acme.myext");

    public void summarizeBootstrap(String text) {
        LOGGER.info(text);
    }
}
