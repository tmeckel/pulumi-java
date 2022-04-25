// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxUserConfigurationResponse {
    /**
     * @return The uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     * 
     */
    private final @Nullable Integer gid;
    /**
     * @return The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool&#39;s enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user&#39;s .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user&#39;s .ssh directory is done).
     * 
     */
    private final @Nullable String sshPrivateKey;
    /**
     * @return The uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     * 
     */
    private final @Nullable Integer uid;

    @CustomType.Constructor
    private LinuxUserConfigurationResponse(
        @CustomType.Parameter("gid") @Nullable Integer gid,
        @CustomType.Parameter("sshPrivateKey") @Nullable String sshPrivateKey,
        @CustomType.Parameter("uid") @Nullable Integer uid) {
        this.gid = gid;
        this.sshPrivateKey = sshPrivateKey;
        this.uid = uid;
    }

    /**
     * @return The uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     * 
     */
    public Optional<Integer> gid() {
        return Optional.ofNullable(this.gid);
    }
    /**
     * @return The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool&#39;s enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user&#39;s .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user&#39;s .ssh directory is done).
     * 
     */
    public Optional<String> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }
    /**
     * @return The uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     * 
     */
    public Optional<Integer> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxUserConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer gid;
        private @Nullable String sshPrivateKey;
        private @Nullable Integer uid;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxUserConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.sshPrivateKey = defaults.sshPrivateKey;
    	      this.uid = defaults.uid;
        }

        public Builder gid(@Nullable Integer gid) {
            this.gid = gid;
            return this;
        }
        public Builder sshPrivateKey(@Nullable String sshPrivateKey) {
            this.sshPrivateKey = sshPrivateKey;
            return this;
        }
        public Builder uid(@Nullable Integer uid) {
            this.uid = uid;
            return this;
        }        public LinuxUserConfigurationResponse build() {
            return new LinuxUserConfigurationResponse(gid, sshPrivateKey, uid);
        }
    }
}
