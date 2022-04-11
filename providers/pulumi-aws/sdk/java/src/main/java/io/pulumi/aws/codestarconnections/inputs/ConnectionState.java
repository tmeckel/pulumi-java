// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * The codestar connection ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The codestar connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
     * 
     */
    @Import(name="connectionStatus")
      private final @Nullable Output<String> connectionStatus;

    public Output<String> getConnectionStatus() {
        return this.connectionStatus == null ? Codegen.empty() : this.connectionStatus;
    }

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `provider_type`
     * 
     */
    @Import(name="hostArn")
      private final @Nullable Output<String> hostArn;

    public Output<String> getHostArn() {
        return this.hostArn == null ? Codegen.empty() : this.hostArn;
    }

    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `provider_type` will create a new resource. Conflicts with `host_arn`
     * 
     */
    @Import(name="providerType")
      private final @Nullable Output<String> providerType;

    public Output<String> getProviderType() {
        return this.providerType == null ? Codegen.empty() : this.providerType;
    }

    /**
     * Map of key-value resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ConnectionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> connectionStatus,
        @Nullable Output<String> hostArn,
        @Nullable Output<String> name,
        @Nullable Output<String> providerType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.connectionStatus = connectionStatus;
        this.hostArn = hostArn;
        this.name = name;
        this.providerType = providerType;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ConnectionState() {
        this.arn = Codegen.empty();
        this.connectionStatus = Codegen.empty();
        this.hostArn = Codegen.empty();
        this.name = Codegen.empty();
        this.providerType = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> connectionStatus;
        private @Nullable Output<String> hostArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> providerType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.hostArn = defaults.hostArn;
    	      this.name = defaults.name;
    	      this.providerType = defaults.providerType;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder connectionStatus(@Nullable Output<String> connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public Builder connectionStatus(@Nullable String connectionStatus) {
            this.connectionStatus = Codegen.ofNullable(connectionStatus);
            return this;
        }
        public Builder hostArn(@Nullable Output<String> hostArn) {
            this.hostArn = hostArn;
            return this;
        }
        public Builder hostArn(@Nullable String hostArn) {
            this.hostArn = Codegen.ofNullable(hostArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder providerType(@Nullable Output<String> providerType) {
            this.providerType = providerType;
            return this;
        }
        public Builder providerType(@Nullable String providerType) {
            this.providerType = Codegen.ofNullable(providerType);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ConnectionState build() {
            return new ConnectionState(arn, connectionStatus, hostArn, name, providerType, tags, tagsAll);
        }
    }
}
