// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HierarchyInformationResponse {
    /**
     * Represents configuration name that uniquely identifies configuration
     * 
     */
    private final @Nullable String configurationName;
    /**
     * Represents product family name that uniquely identifies product family
     * 
     */
    private final @Nullable String productFamilyName;
    /**
     * Represents product line name that uniquely identifies product line
     * 
     */
    private final @Nullable String productLineName;
    /**
     * Represents product name that uniquely identifies product
     * 
     */
    private final @Nullable String productName;

    @OutputCustomType.Constructor
    private HierarchyInformationResponse(
        @OutputCustomType.Parameter("configurationName") @Nullable String configurationName,
        @OutputCustomType.Parameter("productFamilyName") @Nullable String productFamilyName,
        @OutputCustomType.Parameter("productLineName") @Nullable String productLineName,
        @OutputCustomType.Parameter("productName") @Nullable String productName) {
        this.configurationName = configurationName;
        this.productFamilyName = productFamilyName;
        this.productLineName = productLineName;
        this.productName = productName;
    }

    /**
     * Represents configuration name that uniquely identifies configuration
     * 
    */
    public Optional<String> getConfigurationName() {
        return Optional.ofNullable(this.configurationName);
    }
    /**
     * Represents product family name that uniquely identifies product family
     * 
    */
    public Optional<String> getProductFamilyName() {
        return Optional.ofNullable(this.productFamilyName);
    }
    /**
     * Represents product line name that uniquely identifies product line
     * 
    */
    public Optional<String> getProductLineName() {
        return Optional.ofNullable(this.productLineName);
    }
    /**
     * Represents product name that uniquely identifies product
     * 
    */
    public Optional<String> getProductName() {
        return Optional.ofNullable(this.productName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configurationName;
        private @Nullable String productFamilyName;
        private @Nullable String productLineName;
        private @Nullable String productName;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.productFamilyName = defaults.productFamilyName;
    	      this.productLineName = defaults.productLineName;
    	      this.productName = defaults.productName;
        }

        public Builder configurationName(@Nullable String configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        public Builder productFamilyName(@Nullable String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }

        public Builder productLineName(@Nullable String productLineName) {
            this.productLineName = productLineName;
            return this;
        }

        public Builder productName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }
        public HierarchyInformationResponse build() {
            return new HierarchyInformationResponse(configurationName, productFamilyName, productLineName, productName);
        }
    }
}
