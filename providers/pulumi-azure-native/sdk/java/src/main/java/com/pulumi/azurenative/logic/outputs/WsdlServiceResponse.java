// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WsdlServiceResponse {
    /**
     * @return The list of endpoints&#39; qualified names.
     * 
     */
    private final @Nullable List<String> endpointQualifiedNames;
    /**
     * @return The qualified name.
     * 
     */
    private final @Nullable String qualifiedName;

    @CustomType.Constructor
    private WsdlServiceResponse(
        @CustomType.Parameter("endpointQualifiedNames") @Nullable List<String> endpointQualifiedNames,
        @CustomType.Parameter("qualifiedName") @Nullable String qualifiedName) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        this.qualifiedName = qualifiedName;
    }

    /**
     * @return The list of endpoints&#39; qualified names.
     * 
     */
    public List<String> endpointQualifiedNames() {
        return this.endpointQualifiedNames == null ? List.of() : this.endpointQualifiedNames;
    }
    /**
     * @return The qualified name.
     * 
     */
    public Optional<String> qualifiedName() {
        return Optional.ofNullable(this.qualifiedName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> endpointQualifiedNames;
        private @Nullable String qualifiedName;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointQualifiedNames = defaults.endpointQualifiedNames;
    	      this.qualifiedName = defaults.qualifiedName;
        }

        public Builder endpointQualifiedNames(@Nullable List<String> endpointQualifiedNames) {
            this.endpointQualifiedNames = endpointQualifiedNames;
            return this;
        }
        public Builder endpointQualifiedNames(String... endpointQualifiedNames) {
            return endpointQualifiedNames(List.of(endpointQualifiedNames));
        }
        public Builder qualifiedName(@Nullable String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }        public WsdlServiceResponse build() {
            return new WsdlServiceResponse(endpointQualifiedNames, qualifiedName);
        }
    }
}
