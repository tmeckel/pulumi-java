// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TriggerBuildAvailableSecretsSecretManager {
    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    private final String env;
    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    private final String versionName;

    @OutputCustomType.Constructor
    private TriggerBuildAvailableSecretsSecretManager(
        @OutputCustomType.Parameter("env") String env,
        @OutputCustomType.Parameter("versionName") String versionName) {
        this.env = env;
        this.versionName = versionName;
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
    */
    public String getEnv() {
        return this.env;
    }
    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
    */
    public String getVersionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildAvailableSecretsSecretManager defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String env;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildAvailableSecretsSecretManager defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        public Builder env(String env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }
        public TriggerBuildAvailableSecretsSecretManager build() {
            return new TriggerBuildAvailableSecretsSecretManager(env, versionName);
        }
    }
}
