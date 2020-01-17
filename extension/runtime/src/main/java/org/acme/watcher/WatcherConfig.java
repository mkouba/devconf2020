package org.acme.watcher;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class WatcherConfig {

    /**
     * Regex that defines what JAX-RS resources should be watched automatically based on the package of the resource class to be
     * included.
     * <p>
     * By default, asterisk(*) is used, meaning all resources will be modified.
     */
    @ConfigItem(defaultValue = ".*")
    public String regularExpression;

    /**
     * Controls the enablement of whole extension. If disabled, no action will be taken.
     * <p>
     * By default, false is present.
     */
    @ConfigItem(defaultValue = "false")
    public boolean disable;

    /**
     * The time limit used by watcher. If a method invocation exceeds the limit a warning message is logged.
     * <p>
     * By default, the limit is 500ms.
     */
    @ConfigItem(defaultValue = "500")
    public long limit;

    /**
     * If enabled all incidents are logged, otherwise no action will be taken.
     */
    @ConfigItem(defaultValue = "true")
    public boolean logEnabled;
}