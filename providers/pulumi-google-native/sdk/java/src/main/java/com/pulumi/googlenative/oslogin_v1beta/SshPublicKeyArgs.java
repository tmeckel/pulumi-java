// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.oslogin_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @Import(name="expirationTimeUsec")
    private @Nullable Output<String> expirationTimeUsec;

    /**
     * @return An expiration time in microseconds since epoch.
     * 
     */
    public Optional<Output<String>> expirationTimeUsec() {
        return Optional.ofNullable(this.expirationTimeUsec);
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="userId", required=true)
    private Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    private SshPublicKeyArgs() {}

    private SshPublicKeyArgs(SshPublicKeyArgs $) {
        this.expirationTimeUsec = $.expirationTimeUsec;
        this.key = $.key;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshPublicKeyArgs $;

        public Builder() {
            $ = new SshPublicKeyArgs();
        }

        public Builder(SshPublicKeyArgs defaults) {
            $ = new SshPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationTimeUsec An expiration time in microseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUsec(@Nullable Output<String> expirationTimeUsec) {
            $.expirationTimeUsec = expirationTimeUsec;
            return this;
        }

        /**
         * @param expirationTimeUsec An expiration time in microseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUsec(String expirationTimeUsec) {
            return expirationTimeUsec(Output.of(expirationTimeUsec));
        }

        /**
         * @param key Public key text in SSH format, defined by RFC4253 section 6.6.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Public key text in SSH format, defined by RFC4253 section 6.6.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public SshPublicKeyArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
