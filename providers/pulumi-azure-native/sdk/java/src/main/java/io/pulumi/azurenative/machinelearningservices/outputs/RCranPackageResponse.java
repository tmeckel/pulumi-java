// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RCranPackageResponse {
    /**
     * The package name.
     * 
     */
    private final @Nullable String name;
    /**
     * The repository name.
     * 
     */
    private final @Nullable String repository;

    @OutputCustomType.Constructor
    private RCranPackageResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("repository") @Nullable String repository) {
        this.name = name;
        this.repository = repository;
    }

    /**
     * The package name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The repository name.
     * 
    */
    public Optional<String> getRepository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RCranPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RCranPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.repository = defaults.repository;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder repository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }
        public RCranPackageResponse build() {
            return new RCranPackageResponse(name, repository);
        }
    }
}
