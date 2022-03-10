// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.helm.sh_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification defining the Helm chart repository to use.
 * 
 */
public final class RepositoryOptsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryOptsArgs Empty = new RepositoryOptsArgs();

    /**
     * The Repository's CA File
     * 
     */
    @InputImport(name="caFile")
      private final @Nullable Input<String> caFile;

    public Input<String> getCaFile() {
        return this.caFile == null ? Input.empty() : this.caFile;
    }

    /**
     * The repository's cert file
     * 
     */
    @InputImport(name="certFile")
      private final @Nullable Input<String> certFile;

    public Input<String> getCertFile() {
        return this.certFile == null ? Input.empty() : this.certFile;
    }

    /**
     * The repository's cert key file
     * 
     */
    @InputImport(name="keyFile")
      private final @Nullable Input<String> keyFile;

    public Input<String> getKeyFile() {
        return this.keyFile == null ? Input.empty() : this.keyFile;
    }

    /**
     * Password for HTTP basic authentication
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
     * 
     */
    @InputImport(name="repo")
      private final @Nullable Input<String> repo;

    public Input<String> getRepo() {
        return this.repo == null ? Input.empty() : this.repo;
    }

    /**
     * Username for HTTP basic authentication
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public RepositoryOptsArgs(
        @Nullable Input<String> caFile,
        @Nullable Input<String> certFile,
        @Nullable Input<String> keyFile,
        @Nullable Input<String> password,
        @Nullable Input<String> repo,
        @Nullable Input<String> username) {
        this.caFile = caFile;
        this.certFile = certFile;
        this.keyFile = keyFile;
        this.password = password;
        this.repo = repo;
        this.username = username;
    }

    private RepositoryOptsArgs() {
        this.caFile = Input.empty();
        this.certFile = Input.empty();
        this.keyFile = Input.empty();
        this.password = Input.empty();
        this.repo = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryOptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caFile;
        private @Nullable Input<String> certFile;
        private @Nullable Input<String> keyFile;
        private @Nullable Input<String> password;
        private @Nullable Input<String> repo;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryOptsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caFile = defaults.caFile;
    	      this.certFile = defaults.certFile;
    	      this.keyFile = defaults.keyFile;
    	      this.password = defaults.password;
    	      this.repo = defaults.repo;
    	      this.username = defaults.username;
        }

        public Builder caFile(@Nullable Input<String> caFile) {
            this.caFile = caFile;
            return this;
        }

        public Builder caFile(@Nullable String caFile) {
            this.caFile = Input.ofNullable(caFile);
            return this;
        }

        public Builder certFile(@Nullable Input<String> certFile) {
            this.certFile = certFile;
            return this;
        }

        public Builder certFile(@Nullable String certFile) {
            this.certFile = Input.ofNullable(certFile);
            return this;
        }

        public Builder keyFile(@Nullable Input<String> keyFile) {
            this.keyFile = keyFile;
            return this;
        }

        public Builder keyFile(@Nullable String keyFile) {
            this.keyFile = Input.ofNullable(keyFile);
            return this;
        }

        public Builder password(@Nullable Input<String> password) {
            this.password = Input.ofNullable(password).asSecret();
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password).asSecret();
            return this;
        }

        public Builder repo(@Nullable Input<String> repo) {
            this.repo = repo;
            return this;
        }

        public Builder repo(@Nullable String repo) {
            this.repo = Input.ofNullable(repo);
            return this;
        }

        public Builder username(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public RepositoryOptsArgs build() {
            return new RepositoryOptsArgs(caFile, certFile, keyFile, password, repo, username);
        }
    }
}
