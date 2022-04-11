// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Holds details about product hierarchy information
 * 
 */
public final class HierarchyInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HierarchyInformationArgs Empty = new HierarchyInformationArgs();

    /**
     * Represents configuration name that uniquely identifies configuration
     * 
     */
    @Import(name="configurationName")
      private final @Nullable Output<String> configurationName;

    public Output<String> getConfigurationName() {
        return this.configurationName == null ? Codegen.empty() : this.configurationName;
    }

    /**
     * Represents product family name that uniquely identifies product family
     * 
     */
    @Import(name="productFamilyName")
      private final @Nullable Output<String> productFamilyName;

    public Output<String> getProductFamilyName() {
        return this.productFamilyName == null ? Codegen.empty() : this.productFamilyName;
    }

    /**
     * Represents product line name that uniquely identifies product line
     * 
     */
    @Import(name="productLineName")
      private final @Nullable Output<String> productLineName;

    public Output<String> getProductLineName() {
        return this.productLineName == null ? Codegen.empty() : this.productLineName;
    }

    /**
     * Represents product name that uniquely identifies product
     * 
     */
    @Import(name="productName")
      private final @Nullable Output<String> productName;

    public Output<String> getProductName() {
        return this.productName == null ? Codegen.empty() : this.productName;
    }

    public HierarchyInformationArgs(
        @Nullable Output<String> configurationName,
        @Nullable Output<String> productFamilyName,
        @Nullable Output<String> productLineName,
        @Nullable Output<String> productName) {
        this.configurationName = configurationName;
        this.productFamilyName = productFamilyName;
        this.productLineName = productLineName;
        this.productName = productName;
    }

    private HierarchyInformationArgs() {
        this.configurationName = Codegen.empty();
        this.productFamilyName = Codegen.empty();
        this.productLineName = Codegen.empty();
        this.productName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationName;
        private @Nullable Output<String> productFamilyName;
        private @Nullable Output<String> productLineName;
        private @Nullable Output<String> productName;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.productFamilyName = defaults.productFamilyName;
    	      this.productLineName = defaults.productLineName;
    	      this.productName = defaults.productName;
        }

        public Builder configurationName(@Nullable Output<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }
        public Builder configurationName(@Nullable String configurationName) {
            this.configurationName = Codegen.ofNullable(configurationName);
            return this;
        }
        public Builder productFamilyName(@Nullable Output<String> productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }
        public Builder productFamilyName(@Nullable String productFamilyName) {
            this.productFamilyName = Codegen.ofNullable(productFamilyName);
            return this;
        }
        public Builder productLineName(@Nullable Output<String> productLineName) {
            this.productLineName = productLineName;
            return this;
        }
        public Builder productLineName(@Nullable String productLineName) {
            this.productLineName = Codegen.ofNullable(productLineName);
            return this;
        }
        public Builder productName(@Nullable Output<String> productName) {
            this.productName = productName;
            return this;
        }
        public Builder productName(@Nullable String productName) {
            this.productName = Codegen.ofNullable(productName);
            return this;
        }        public HierarchyInformationArgs build() {
            return new HierarchyInformationArgs(configurationName, productFamilyName, productLineName, productName);
        }
    }
}
