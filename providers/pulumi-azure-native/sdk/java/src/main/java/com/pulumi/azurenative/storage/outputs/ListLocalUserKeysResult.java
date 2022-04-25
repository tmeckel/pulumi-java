// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.SshPublicKeyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListLocalUserKeysResult {
    /**
     * @return Auto generated by the server for SMB authentication.
     * 
     */
    private final String sharedKey;
    /**
     * @return Optional, local user ssh authorized keys for SFTP.
     * 
     */
    private final @Nullable List<SshPublicKeyResponse> sshAuthorizedKeys;

    @CustomType.Constructor
    private ListLocalUserKeysResult(
        @CustomType.Parameter("sharedKey") String sharedKey,
        @CustomType.Parameter("sshAuthorizedKeys") @Nullable List<SshPublicKeyResponse> sshAuthorizedKeys) {
        this.sharedKey = sharedKey;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
    }

    /**
     * @return Auto generated by the server for SMB authentication.
     * 
     */
    public String sharedKey() {
        return this.sharedKey;
    }
    /**
     * @return Optional, local user ssh authorized keys for SFTP.
     * 
     */
    public List<SshPublicKeyResponse> sshAuthorizedKeys() {
        return this.sshAuthorizedKeys == null ? List.of() : this.sshAuthorizedKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListLocalUserKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sharedKey;
        private @Nullable List<SshPublicKeyResponse> sshAuthorizedKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListLocalUserKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sharedKey = defaults.sharedKey;
    	      this.sshAuthorizedKeys = defaults.sshAuthorizedKeys;
        }

        public Builder sharedKey(String sharedKey) {
            this.sharedKey = Objects.requireNonNull(sharedKey);
            return this;
        }
        public Builder sshAuthorizedKeys(@Nullable List<SshPublicKeyResponse> sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            return this;
        }
        public Builder sshAuthorizedKeys(SshPublicKeyResponse... sshAuthorizedKeys) {
            return sshAuthorizedKeys(List.of(sshAuthorizedKeys));
        }        public ListLocalUserKeysResult build() {
            return new ListLocalUserKeysResult(sharedKey, sshAuthorizedKeys);
        }
    }
}
