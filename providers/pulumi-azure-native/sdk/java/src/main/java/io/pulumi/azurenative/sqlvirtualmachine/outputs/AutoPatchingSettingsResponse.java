// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoPatchingSettingsResponse {
    /**
     * Day of week to apply the patch on.
     * 
     */
    private final @Nullable String dayOfWeek;
    /**
     * Enable or disable autopatching on SQL virtual machine.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * Duration of patching.
     * 
     */
    private final @Nullable Integer maintenanceWindowDuration;
    /**
     * Hour of the day when patching is initiated. Local VM time.
     * 
     */
    private final @Nullable Integer maintenanceWindowStartingHour;

    @OutputCustomType.Constructor
    private AutoPatchingSettingsResponse(
        @OutputCustomType.Parameter("dayOfWeek") @Nullable String dayOfWeek,
        @OutputCustomType.Parameter("enable") @Nullable Boolean enable,
        @OutputCustomType.Parameter("maintenanceWindowDuration") @Nullable Integer maintenanceWindowDuration,
        @OutputCustomType.Parameter("maintenanceWindowStartingHour") @Nullable Integer maintenanceWindowStartingHour) {
        this.dayOfWeek = dayOfWeek;
        this.enable = enable;
        this.maintenanceWindowDuration = maintenanceWindowDuration;
        this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
    }

    /**
     * Day of week to apply the patch on.
     * 
    */
    public Optional<String> getDayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    /**
     * Enable or disable autopatching on SQL virtual machine.
     * 
    */
    public Optional<Boolean> getEnable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * Duration of patching.
     * 
    */
    public Optional<Integer> getMaintenanceWindowDuration() {
        return Optional.ofNullable(this.maintenanceWindowDuration);
    }
    /**
     * Hour of the day when patching is initiated. Local VM time.
     * 
    */
    public Optional<Integer> getMaintenanceWindowStartingHour() {
        return Optional.ofNullable(this.maintenanceWindowStartingHour);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoPatchingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dayOfWeek;
        private @Nullable Boolean enable;
        private @Nullable Integer maintenanceWindowDuration;
        private @Nullable Integer maintenanceWindowStartingHour;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoPatchingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.enable = defaults.enable;
    	      this.maintenanceWindowDuration = defaults.maintenanceWindowDuration;
    	      this.maintenanceWindowStartingHour = defaults.maintenanceWindowStartingHour;
        }

        public Builder dayOfWeek(@Nullable String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }

        public Builder maintenanceWindowDuration(@Nullable Integer maintenanceWindowDuration) {
            this.maintenanceWindowDuration = maintenanceWindowDuration;
            return this;
        }

        public Builder maintenanceWindowStartingHour(@Nullable Integer maintenanceWindowStartingHour) {
            this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
            return this;
        }
        public AutoPatchingSettingsResponse build() {
            return new AutoPatchingSettingsResponse(dayOfWeek, enable, maintenanceWindowDuration, maintenanceWindowStartingHour);
        }
    }
}
