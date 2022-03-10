// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StackCustomCookbooksSource {
    /**
     * Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String password;
    /**
     * For sources that are version-aware, the revision to use.
     * 
     */
    private final @Nullable String revision;
    /**
     * SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String sshKey;
    /**
     * The type of source to use. For example, "archive".
     * 
     */
    private final String type;
    /**
     * The URL where the cookbooks resource can be found.
     * 
     */
    private final String url;
    /**
     * Username to use when authenticating to the source.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor
    private StackCustomCookbooksSource(
        @OutputCustomType.Parameter("password") @Nullable String password,
        @OutputCustomType.Parameter("revision") @Nullable String revision,
        @OutputCustomType.Parameter("sshKey") @Nullable String sshKey,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("url") String url,
        @OutputCustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.revision = revision;
        this.sshKey = sshKey;
        this.type = type;
        this.url = url;
        this.username = username;
    }

    /**
     * Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * For sources that are version-aware, the revision to use.
     * 
    */
    public Optional<String> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
    */
    public Optional<String> getSshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * The type of source to use. For example, "archive".
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The URL where the cookbooks resource can be found.
     * 
    */
    public String getUrl() {
        return this.url;
    }
    /**
     * Username to use when authenticating to the source.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackCustomCookbooksSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String revision;
        private @Nullable String sshKey;
        private String type;
        private String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(StackCustomCookbooksSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder revision(@Nullable String revision) {
            this.revision = revision;
            return this;
        }

        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public StackCustomCookbooksSource build() {
            return new StackCustomCookbooksSource(password, revision, sshKey, type, url, username);
        }
    }
}
