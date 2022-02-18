// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.redis_v1beta1.enums.PersistenceConfigPersistenceMode;
import io.pulumi.googlenative.redis_v1beta1.enums.PersistenceConfigRdbSnapshotPeriod;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of the persistence functionality.
 * 
 */
public final class PersistenceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistenceConfigArgs Empty = new PersistenceConfigArgs();

    /**
     * Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    @InputImport(name="persistenceMode")
    private final @Nullable Input<PersistenceConfigPersistenceMode> persistenceMode;

    public Input<PersistenceConfigPersistenceMode> getPersistenceMode() {
        return this.persistenceMode == null ? Input.empty() : this.persistenceMode;
    }

    /**
     * Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    @InputImport(name="rdbSnapshotPeriod")
    private final @Nullable Input<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod;

    public Input<PersistenceConfigRdbSnapshotPeriod> getRdbSnapshotPeriod() {
        return this.rdbSnapshotPeriod == null ? Input.empty() : this.rdbSnapshotPeriod;
    }

    /**
     * Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    @InputImport(name="rdbSnapshotStartTime")
    private final @Nullable Input<String> rdbSnapshotStartTime;

    public Input<String> getRdbSnapshotStartTime() {
        return this.rdbSnapshotStartTime == null ? Input.empty() : this.rdbSnapshotStartTime;
    }

    public PersistenceConfigArgs(
        @Nullable Input<PersistenceConfigPersistenceMode> persistenceMode,
        @Nullable Input<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod,
        @Nullable Input<String> rdbSnapshotStartTime) {
        this.persistenceMode = persistenceMode;
        this.rdbSnapshotPeriod = rdbSnapshotPeriod;
        this.rdbSnapshotStartTime = rdbSnapshotStartTime;
    }

    private PersistenceConfigArgs() {
        this.persistenceMode = Input.empty();
        this.rdbSnapshotPeriod = Input.empty();
        this.rdbSnapshotStartTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PersistenceConfigPersistenceMode> persistenceMode;
        private @Nullable Input<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod;
        private @Nullable Input<String> rdbSnapshotStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.persistenceMode = defaults.persistenceMode;
    	      this.rdbSnapshotPeriod = defaults.rdbSnapshotPeriod;
    	      this.rdbSnapshotStartTime = defaults.rdbSnapshotStartTime;
        }

        public Builder setPersistenceMode(@Nullable Input<PersistenceConfigPersistenceMode> persistenceMode) {
            this.persistenceMode = persistenceMode;
            return this;
        }

        public Builder setPersistenceMode(@Nullable PersistenceConfigPersistenceMode persistenceMode) {
            this.persistenceMode = Input.ofNullable(persistenceMode);
            return this;
        }

        public Builder setRdbSnapshotPeriod(@Nullable Input<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = rdbSnapshotPeriod;
            return this;
        }

        public Builder setRdbSnapshotPeriod(@Nullable PersistenceConfigRdbSnapshotPeriod rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = Input.ofNullable(rdbSnapshotPeriod);
            return this;
        }

        public Builder setRdbSnapshotStartTime(@Nullable Input<String> rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = rdbSnapshotStartTime;
            return this;
        }

        public Builder setRdbSnapshotStartTime(@Nullable String rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = Input.ofNullable(rdbSnapshotStartTime);
            return this;
        }

        public PersistenceConfigArgs build() {
            return new PersistenceConfigArgs(persistenceMode, rdbSnapshotPeriod, rdbSnapshotStartTime);
        }
    }
}
