// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetUserSshKeyResult {
    private final String encoding;
    /**
     * The MD5 message digest of the SSH public key.
     * 
     */
    private final String fingerprint;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The SSH public key.
     * 
     */
    private final String publicKey;
    private final String sshPublicKeyId;
    /**
     * The status of the SSH public key. Active means that the key can be used for authentication with an CodeCommit repository. Inactive means that the key cannot be used.
     * 
     */
    private final String status;
    private final String username;

    @OutputCustomType.Constructor
    private GetUserSshKeyResult(
        @OutputCustomType.Parameter("encoding") String encoding,
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("publicKey") String publicKey,
        @OutputCustomType.Parameter("sshPublicKeyId") String sshPublicKeyId,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("username") String username) {
        this.encoding = encoding;
        this.fingerprint = fingerprint;
        this.id = id;
        this.publicKey = publicKey;
        this.sshPublicKeyId = sshPublicKeyId;
        this.status = status;
        this.username = username;
    }

    public String getEncoding() {
        return this.encoding;
    }
    /**
     * The MD5 message digest of the SSH public key.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The SSH public key.
     * 
    */
    public String getPublicKey() {
        return this.publicKey;
    }
    public String getSshPublicKeyId() {
        return this.sshPublicKeyId;
    }
    /**
     * The status of the SSH public key. Active means that the key can be used for authentication with an CodeCommit repository. Inactive means that the key cannot be used.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSshKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encoding;
        private String fingerprint;
        private String id;
        private String publicKey;
        private String sshPublicKeyId;
        private String status;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSshKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.publicKey = defaults.publicKey;
    	      this.sshPublicKeyId = defaults.sshPublicKeyId;
    	      this.status = defaults.status;
    	      this.username = defaults.username;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder sshPublicKeyId(String sshPublicKeyId) {
            this.sshPublicKeyId = Objects.requireNonNull(sshPublicKeyId);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetUserSshKeyResult build() {
            return new GetUserSshKeyResult(encoding, fingerprint, id, publicKey, sshPublicKeyId, status, username);
        }
    }
}
