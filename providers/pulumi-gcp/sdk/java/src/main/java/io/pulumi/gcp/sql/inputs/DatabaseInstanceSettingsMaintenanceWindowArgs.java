// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsMaintenanceWindowArgs Empty = new DatabaseInstanceSettingsMaintenanceWindowArgs();

    /**
     * Day of week (`1-7`), starting on Monday
     * 
     */
    @InputImport(name="day")
      private final @Nullable Input<Integer> day;

    public Input<Integer> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * Hour of day (`0-23`), ignored if `day` not set
     * 
     */
    @InputImport(name="hour")
      private final @Nullable Input<Integer> hour;

    public Input<Integer> getHour() {
        return this.hour == null ? Input.empty() : this.hour;
    }

    /**
     * Receive updates earlier (`canary`) or later
     * (`stable`)
     * 
     */
    @InputImport(name="updateTrack")
      private final @Nullable Input<String> updateTrack;

    public Input<String> getUpdateTrack() {
        return this.updateTrack == null ? Input.empty() : this.updateTrack;
    }

    public DatabaseInstanceSettingsMaintenanceWindowArgs(
        @Nullable Input<Integer> day,
        @Nullable Input<Integer> hour,
        @Nullable Input<String> updateTrack) {
        this.day = day;
        this.hour = hour;
        this.updateTrack = updateTrack;
    }

    private DatabaseInstanceSettingsMaintenanceWindowArgs() {
        this.day = Input.empty();
        this.hour = Input.empty();
        this.updateTrack = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> day;
        private @Nullable Input<Integer> hour;
        private @Nullable Input<String> updateTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.updateTrack = defaults.updateTrack;
        }

        public Builder day(@Nullable Input<Integer> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable Integer day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder hour(@Nullable Input<Integer> hour) {
            this.hour = hour;
            return this;
        }

        public Builder hour(@Nullable Integer hour) {
            this.hour = Input.ofNullable(hour);
            return this;
        }

        public Builder updateTrack(@Nullable Input<String> updateTrack) {
            this.updateTrack = updateTrack;
            return this;
        }

        public Builder updateTrack(@Nullable String updateTrack) {
            this.updateTrack = Input.ofNullable(updateTrack);
            return this;
        }
        public DatabaseInstanceSettingsMaintenanceWindowArgs build() {
            return new DatabaseInstanceSettingsMaintenanceWindowArgs(day, hour, updateTrack);
        }
    }
}
