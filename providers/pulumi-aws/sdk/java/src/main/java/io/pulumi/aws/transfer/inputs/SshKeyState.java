// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshKeyState extends io.pulumi.resources.ResourceArgs {

    public static final SshKeyState Empty = new SshKeyState();

    /**
     * The public key portion of an SSH key pair.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @InputImport(name="serverId")
      private final @Nullable Input<String> serverId;

    public Input<String> getServerId() {
        return this.serverId == null ? Input.empty() : this.serverId;
    }

    /**
     * The name of the user account that is assigned to one or more servers.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public SshKeyState(
        @Nullable Input<String> body,
        @Nullable Input<String> serverId,
        @Nullable Input<String> userName) {
        this.body = body;
        this.serverId = serverId;
        this.userName = userName;
    }

    private SshKeyState() {
        this.body = Input.empty();
        this.serverId = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> body;
        private @Nullable Input<String> serverId;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SshKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.serverId = defaults.serverId;
    	      this.userName = defaults.userName;
        }

        public Builder body(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder serverId(@Nullable Input<String> serverId) {
            this.serverId = serverId;
            return this;
        }

        public Builder serverId(@Nullable String serverId) {
            this.serverId = Input.ofNullable(serverId);
            return this;
        }

        public Builder userName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public SshKeyState build() {
            return new SshKeyState(body, serverId, userName);
        }
    }
}
