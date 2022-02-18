// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MaintenanceWindowResponse {
    /**
     * The day of week, when the window starts.
     * 
     */
    private final String dayOfWeek;
    /**
     * The hour of day (0-23) when the window starts.
     * 
     */
    private final Integer hourOfDay;

    @OutputCustomType.Constructor({"dayOfWeek","hourOfDay"})
    private MaintenanceWindowResponse(
        String dayOfWeek,
        Integer hourOfDay) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
        this.hourOfDay = Objects.requireNonNull(hourOfDay);
    }

    /**
     * The day of week, when the window starts.
     * 
     */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * The hour of day (0-23) when the window starts.
     * 
     */
    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private Integer hourOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.hourOfDay = defaults.hourOfDay;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setHourOfDay(Integer hourOfDay) {
            this.hourOfDay = Objects.requireNonNull(hourOfDay);
            return this;
        }

        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(dayOfWeek, hourOfDay);
        }
    }
}
