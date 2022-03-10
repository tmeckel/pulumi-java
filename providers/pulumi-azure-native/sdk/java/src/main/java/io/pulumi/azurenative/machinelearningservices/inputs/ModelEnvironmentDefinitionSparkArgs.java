// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.SparkMavenPackageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for a Spark environment.
 * 
 */
public final class ModelEnvironmentDefinitionSparkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelEnvironmentDefinitionSparkArgs Empty = new ModelEnvironmentDefinitionSparkArgs();

    /**
     * The Spark packages to use.
     * 
     */
    @InputImport(name="packages")
      private final @Nullable Input<List<SparkMavenPackageArgs>> packages;

    public Input<List<SparkMavenPackageArgs>> getPackages() {
        return this.packages == null ? Input.empty() : this.packages;
    }

    /**
     * Whether to precache the packages.
     * 
     */
    @InputImport(name="precachePackages")
      private final @Nullable Input<Boolean> precachePackages;

    public Input<Boolean> getPrecachePackages() {
        return this.precachePackages == null ? Input.empty() : this.precachePackages;
    }

    /**
     * The list of spark repositories.
     * 
     */
    @InputImport(name="repositories")
      private final @Nullable Input<List<String>> repositories;

    public Input<List<String>> getRepositories() {
        return this.repositories == null ? Input.empty() : this.repositories;
    }

    public ModelEnvironmentDefinitionSparkArgs(
        @Nullable Input<List<SparkMavenPackageArgs>> packages,
        @Nullable Input<Boolean> precachePackages,
        @Nullable Input<List<String>> repositories) {
        this.packages = packages;
        this.precachePackages = precachePackages;
        this.repositories = repositories;
    }

    private ModelEnvironmentDefinitionSparkArgs() {
        this.packages = Input.empty();
        this.precachePackages = Input.empty();
        this.repositories = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionSparkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SparkMavenPackageArgs>> packages;
        private @Nullable Input<Boolean> precachePackages;
        private @Nullable Input<List<String>> repositories;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionSparkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packages = defaults.packages;
    	      this.precachePackages = defaults.precachePackages;
    	      this.repositories = defaults.repositories;
        }

        public Builder packages(@Nullable Input<List<SparkMavenPackageArgs>> packages) {
            this.packages = packages;
            return this;
        }

        public Builder packages(@Nullable List<SparkMavenPackageArgs> packages) {
            this.packages = Input.ofNullable(packages);
            return this;
        }

        public Builder precachePackages(@Nullable Input<Boolean> precachePackages) {
            this.precachePackages = precachePackages;
            return this;
        }

        public Builder precachePackages(@Nullable Boolean precachePackages) {
            this.precachePackages = Input.ofNullable(precachePackages);
            return this;
        }

        public Builder repositories(@Nullable Input<List<String>> repositories) {
            this.repositories = repositories;
            return this;
        }

        public Builder repositories(@Nullable List<String> repositories) {
            this.repositories = Input.ofNullable(repositories);
            return this;
        }
        public ModelEnvironmentDefinitionSparkArgs build() {
            return new ModelEnvironmentDefinitionSparkArgs(packages, precachePackages, repositories);
        }
    }
}
