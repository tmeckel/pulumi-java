// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.RepositoryRefDefinitionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters to reconcile to the GitRepository source kind type.
 * 
 */
public final class GitRepositoryDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GitRepositoryDefinitionResponse Empty = new GitRepositoryDefinitionResponse();

    /**
     * Base64-encoded HTTPS certificate authority contents used to access git private git repositories over HTTPS
     * 
     */
    @InputImport(name="httpsCAFile")
      private final @Nullable String httpsCAFile;

    public Optional<String> getHttpsCAFile() {
        return this.httpsCAFile == null ? Optional.empty() : Optional.ofNullable(this.httpsCAFile);
    }

    /**
     * Base64-encoded HTTPS username used to access private git repositories over HTTPS
     * 
     */
    @InputImport(name="httpsUser")
      private final @Nullable String httpsUser;

    public Optional<String> getHttpsUser() {
        return this.httpsUser == null ? Optional.empty() : Optional.ofNullable(this.httpsUser);
    }

    /**
     * Name of a local secret on the Kubernetes cluster to use as the authentication secret rather than the managed or user-provided configuration secrets.
     * 
     */
    @InputImport(name="localAuthRef")
      private final @Nullable String localAuthRef;

    public Optional<String> getLocalAuthRef() {
        return this.localAuthRef == null ? Optional.empty() : Optional.ofNullable(this.localAuthRef);
    }

    /**
     * The source reference for the GitRepository object.
     * 
     */
    @InputImport(name="repositoryRef")
      private final @Nullable RepositoryRefDefinitionResponse repositoryRef;

    public Optional<RepositoryRefDefinitionResponse> getRepositoryRef() {
        return this.repositoryRef == null ? Optional.empty() : Optional.ofNullable(this.repositoryRef);
    }

    /**
     * Base64-encoded known_hosts value containing public SSH keys required to access private git repositories over SSH
     * 
     */
    @InputImport(name="sshKnownHosts")
      private final @Nullable String sshKnownHosts;

    public Optional<String> getSshKnownHosts() {
        return this.sshKnownHosts == null ? Optional.empty() : Optional.ofNullable(this.sshKnownHosts);
    }

    /**
     * The interval at which to re-reconcile the cluster git repository source with the remote.
     * 
     */
    @InputImport(name="syncIntervalInSeconds")
      private final @Nullable Double syncIntervalInSeconds;

    public Optional<Double> getSyncIntervalInSeconds() {
        return this.syncIntervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.syncIntervalInSeconds);
    }

    /**
     * The maximum time to attempt to reconcile the cluster git repository source with the remote.
     * 
     */
    @InputImport(name="timeoutInSeconds")
      private final @Nullable Double timeoutInSeconds;

    public Optional<Double> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutInSeconds);
    }

    /**
     * The URL to sync for the flux configuration git repository.
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public GitRepositoryDefinitionResponse(
        @Nullable String httpsCAFile,
        @Nullable String httpsUser,
        @Nullable String localAuthRef,
        @Nullable RepositoryRefDefinitionResponse repositoryRef,
        @Nullable String sshKnownHosts,
        @Nullable Double syncIntervalInSeconds,
        @Nullable Double timeoutInSeconds,
        @Nullable String url) {
        this.httpsCAFile = httpsCAFile;
        this.httpsUser = httpsUser;
        this.localAuthRef = localAuthRef;
        this.repositoryRef = repositoryRef;
        this.sshKnownHosts = sshKnownHosts;
        this.syncIntervalInSeconds = syncIntervalInSeconds == null ? 6e+02 : syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds == null ? 6e+02 : timeoutInSeconds;
        this.url = url;
    }

    private GitRepositoryDefinitionResponse() {
        this.httpsCAFile = null;
        this.httpsUser = null;
        this.localAuthRef = null;
        this.repositoryRef = null;
        this.sshKnownHosts = null;
        this.syncIntervalInSeconds = null;
        this.timeoutInSeconds = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepositoryDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpsCAFile;
        private @Nullable String httpsUser;
        private @Nullable String localAuthRef;
        private @Nullable RepositoryRefDefinitionResponse repositoryRef;
        private @Nullable String sshKnownHosts;
        private @Nullable Double syncIntervalInSeconds;
        private @Nullable Double timeoutInSeconds;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepositoryDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpsCAFile = defaults.httpsCAFile;
    	      this.httpsUser = defaults.httpsUser;
    	      this.localAuthRef = defaults.localAuthRef;
    	      this.repositoryRef = defaults.repositoryRef;
    	      this.sshKnownHosts = defaults.sshKnownHosts;
    	      this.syncIntervalInSeconds = defaults.syncIntervalInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.url = defaults.url;
        }

        public Builder httpsCAFile(@Nullable String httpsCAFile) {
            this.httpsCAFile = httpsCAFile;
            return this;
        }

        public Builder httpsUser(@Nullable String httpsUser) {
            this.httpsUser = httpsUser;
            return this;
        }

        public Builder localAuthRef(@Nullable String localAuthRef) {
            this.localAuthRef = localAuthRef;
            return this;
        }

        public Builder repositoryRef(@Nullable RepositoryRefDefinitionResponse repositoryRef) {
            this.repositoryRef = repositoryRef;
            return this;
        }

        public Builder sshKnownHosts(@Nullable String sshKnownHosts) {
            this.sshKnownHosts = sshKnownHosts;
            return this;
        }

        public Builder syncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public GitRepositoryDefinitionResponse build() {
            return new GitRepositoryDefinitionResponse(httpsCAFile, httpsUser, localAuthRef, repositoryRef, sshKnownHosts, syncIntervalInSeconds, timeoutInSeconds, url);
        }
    }
}
