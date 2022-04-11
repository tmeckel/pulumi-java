// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.RCranPackageArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.RGitHubPackageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for a R environment.
 * 
 */
public final class ModelEnvironmentDefinitionRArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelEnvironmentDefinitionRArgs Empty = new ModelEnvironmentDefinitionRArgs();

    /**
     * The packages from Bioconductor.
     * 
     */
    @Import(name="bioConductorPackages")
      private final @Nullable Output<List<String>> bioConductorPackages;

    public Output<List<String>> getBioConductorPackages() {
        return this.bioConductorPackages == null ? Codegen.empty() : this.bioConductorPackages;
    }

    /**
     * The CRAN packages to use.
     * 
     */
    @Import(name="cranPackages")
      private final @Nullable Output<List<RCranPackageArgs>> cranPackages;

    public Output<List<RCranPackageArgs>> getCranPackages() {
        return this.cranPackages == null ? Codegen.empty() : this.cranPackages;
    }

    /**
     * The packages from custom urls.
     * 
     */
    @Import(name="customUrlPackages")
      private final @Nullable Output<List<String>> customUrlPackages;

    public Output<List<String>> getCustomUrlPackages() {
        return this.customUrlPackages == null ? Codegen.empty() : this.customUrlPackages;
    }

    /**
     * The packages directly from GitHub.
     * 
     */
    @Import(name="gitHubPackages")
      private final @Nullable Output<List<RGitHubPackageArgs>> gitHubPackages;

    public Output<List<RGitHubPackageArgs>> getGitHubPackages() {
        return this.gitHubPackages == null ? Codegen.empty() : this.gitHubPackages;
    }

    /**
     * The version of R to be installed
     * 
     */
    @Import(name="rVersion")
      private final @Nullable Output<String> rVersion;

    public Output<String> getRVersion() {
        return this.rVersion == null ? Codegen.empty() : this.rVersion;
    }

    /**
     * The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    @Import(name="rscriptPath")
      private final @Nullable Output<String> rscriptPath;

    public Output<String> getRscriptPath() {
        return this.rscriptPath == null ? Codegen.empty() : this.rscriptPath;
    }

    /**
     * Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. "2019-04-17"
     * 
     */
    @Import(name="snapshotDate")
      private final @Nullable Output<String> snapshotDate;

    public Output<String> getSnapshotDate() {
        return this.snapshotDate == null ? Codegen.empty() : this.snapshotDate;
    }

    /**
     * Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    @Import(name="userManaged")
      private final @Nullable Output<Boolean> userManaged;

    public Output<Boolean> getUserManaged() {
        return this.userManaged == null ? Codegen.empty() : this.userManaged;
    }

    public ModelEnvironmentDefinitionRArgs(
        @Nullable Output<List<String>> bioConductorPackages,
        @Nullable Output<List<RCranPackageArgs>> cranPackages,
        @Nullable Output<List<String>> customUrlPackages,
        @Nullable Output<List<RGitHubPackageArgs>> gitHubPackages,
        @Nullable Output<String> rVersion,
        @Nullable Output<String> rscriptPath,
        @Nullable Output<String> snapshotDate,
        @Nullable Output<Boolean> userManaged) {
        this.bioConductorPackages = bioConductorPackages;
        this.cranPackages = cranPackages;
        this.customUrlPackages = customUrlPackages;
        this.gitHubPackages = gitHubPackages;
        this.rVersion = rVersion;
        this.rscriptPath = rscriptPath;
        this.snapshotDate = snapshotDate;
        this.userManaged = userManaged;
    }

    private ModelEnvironmentDefinitionRArgs() {
        this.bioConductorPackages = Codegen.empty();
        this.cranPackages = Codegen.empty();
        this.customUrlPackages = Codegen.empty();
        this.gitHubPackages = Codegen.empty();
        this.rVersion = Codegen.empty();
        this.rscriptPath = Codegen.empty();
        this.snapshotDate = Codegen.empty();
        this.userManaged = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionRArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> bioConductorPackages;
        private @Nullable Output<List<RCranPackageArgs>> cranPackages;
        private @Nullable Output<List<String>> customUrlPackages;
        private @Nullable Output<List<RGitHubPackageArgs>> gitHubPackages;
        private @Nullable Output<String> rVersion;
        private @Nullable Output<String> rscriptPath;
        private @Nullable Output<String> snapshotDate;
        private @Nullable Output<Boolean> userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionRArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bioConductorPackages = defaults.bioConductorPackages;
    	      this.cranPackages = defaults.cranPackages;
    	      this.customUrlPackages = defaults.customUrlPackages;
    	      this.gitHubPackages = defaults.gitHubPackages;
    	      this.rVersion = defaults.rVersion;
    	      this.rscriptPath = defaults.rscriptPath;
    	      this.snapshotDate = defaults.snapshotDate;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder bioConductorPackages(@Nullable Output<List<String>> bioConductorPackages) {
            this.bioConductorPackages = bioConductorPackages;
            return this;
        }
        public Builder bioConductorPackages(@Nullable List<String> bioConductorPackages) {
            this.bioConductorPackages = Codegen.ofNullable(bioConductorPackages);
            return this;
        }
        public Builder bioConductorPackages(String... bioConductorPackages) {
            return bioConductorPackages(List.of(bioConductorPackages));
        }
        public Builder cranPackages(@Nullable Output<List<RCranPackageArgs>> cranPackages) {
            this.cranPackages = cranPackages;
            return this;
        }
        public Builder cranPackages(@Nullable List<RCranPackageArgs> cranPackages) {
            this.cranPackages = Codegen.ofNullable(cranPackages);
            return this;
        }
        public Builder cranPackages(RCranPackageArgs... cranPackages) {
            return cranPackages(List.of(cranPackages));
        }
        public Builder customUrlPackages(@Nullable Output<List<String>> customUrlPackages) {
            this.customUrlPackages = customUrlPackages;
            return this;
        }
        public Builder customUrlPackages(@Nullable List<String> customUrlPackages) {
            this.customUrlPackages = Codegen.ofNullable(customUrlPackages);
            return this;
        }
        public Builder customUrlPackages(String... customUrlPackages) {
            return customUrlPackages(List.of(customUrlPackages));
        }
        public Builder gitHubPackages(@Nullable Output<List<RGitHubPackageArgs>> gitHubPackages) {
            this.gitHubPackages = gitHubPackages;
            return this;
        }
        public Builder gitHubPackages(@Nullable List<RGitHubPackageArgs> gitHubPackages) {
            this.gitHubPackages = Codegen.ofNullable(gitHubPackages);
            return this;
        }
        public Builder gitHubPackages(RGitHubPackageArgs... gitHubPackages) {
            return gitHubPackages(List.of(gitHubPackages));
        }
        public Builder rVersion(@Nullable Output<String> rVersion) {
            this.rVersion = rVersion;
            return this;
        }
        public Builder rVersion(@Nullable String rVersion) {
            this.rVersion = Codegen.ofNullable(rVersion);
            return this;
        }
        public Builder rscriptPath(@Nullable Output<String> rscriptPath) {
            this.rscriptPath = rscriptPath;
            return this;
        }
        public Builder rscriptPath(@Nullable String rscriptPath) {
            this.rscriptPath = Codegen.ofNullable(rscriptPath);
            return this;
        }
        public Builder snapshotDate(@Nullable Output<String> snapshotDate) {
            this.snapshotDate = snapshotDate;
            return this;
        }
        public Builder snapshotDate(@Nullable String snapshotDate) {
            this.snapshotDate = Codegen.ofNullable(snapshotDate);
            return this;
        }
        public Builder userManaged(@Nullable Output<Boolean> userManaged) {
            this.userManaged = userManaged;
            return this;
        }
        public Builder userManaged(@Nullable Boolean userManaged) {
            this.userManaged = Codegen.ofNullable(userManaged);
            return this;
        }        public ModelEnvironmentDefinitionRArgs build() {
            return new ModelEnvironmentDefinitionRArgs(bioConductorPackages, cranPackages, customUrlPackages, gitHubPackages, rVersion, rscriptPath, snapshotDate, userManaged);
        }
    }
}
