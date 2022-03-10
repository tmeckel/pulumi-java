// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseEntitlementArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseEntitlementArgs Empty = new LicenseEntitlementArgs();

    @InputImport(name="allowCheckIn")
      private final @Nullable Input<Boolean> allowCheckIn;

    public Input<Boolean> getAllowCheckIn() {
        return this.allowCheckIn == null ? Input.empty() : this.allowCheckIn;
    }

    @InputImport(name="maxCount")
      private final @Nullable Input<Integer> maxCount;

    public Input<Integer> getMaxCount() {
        return this.maxCount == null ? Input.empty() : this.maxCount;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="overage")
      private final @Nullable Input<Boolean> overage;

    public Input<Boolean> getOverage() {
        return this.overage == null ? Input.empty() : this.overage;
    }

    @InputImport(name="unit", required=true)
      private final Input<String> unit;

    public Input<String> getUnit() {
        return this.unit;
    }

    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public LicenseEntitlementArgs(
        @Nullable Input<Boolean> allowCheckIn,
        @Nullable Input<Integer> maxCount,
        Input<String> name,
        @Nullable Input<Boolean> overage,
        Input<String> unit,
        @Nullable Input<String> value) {
        this.allowCheckIn = allowCheckIn;
        this.maxCount = maxCount;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.overage = overage;
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = value;
    }

    private LicenseEntitlementArgs() {
        this.allowCheckIn = Input.empty();
        this.maxCount = Input.empty();
        this.name = Input.empty();
        this.overage = Input.empty();
        this.unit = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseEntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowCheckIn;
        private @Nullable Input<Integer> maxCount;
        private Input<String> name;
        private @Nullable Input<Boolean> overage;
        private Input<String> unit;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseEntitlementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCheckIn = defaults.allowCheckIn;
    	      this.maxCount = defaults.maxCount;
    	      this.name = defaults.name;
    	      this.overage = defaults.overage;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder allowCheckIn(@Nullable Input<Boolean> allowCheckIn) {
            this.allowCheckIn = allowCheckIn;
            return this;
        }

        public Builder allowCheckIn(@Nullable Boolean allowCheckIn) {
            this.allowCheckIn = Input.ofNullable(allowCheckIn);
            return this;
        }

        public Builder maxCount(@Nullable Input<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = Input.ofNullable(maxCount);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder overage(@Nullable Input<Boolean> overage) {
            this.overage = overage;
            return this;
        }

        public Builder overage(@Nullable Boolean overage) {
            this.overage = Input.ofNullable(overage);
            return this;
        }

        public Builder unit(Input<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder unit(String unit) {
            this.unit = Input.of(Objects.requireNonNull(unit));
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public LicenseEntitlementArgs build() {
            return new LicenseEntitlementArgs(allowCheckIn, maxCount, name, overage, unit, value);
        }
    }
}
