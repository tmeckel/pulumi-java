// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.iam.inputs.ServerCertificateTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCertificateArgs Empty = new ServerCertificateArgs();

    @Import(name="certificateBody")
      private final @Nullable Output<String> certificateBody;

    public Output<String> getCertificateBody() {
        return this.certificateBody == null ? Codegen.empty() : this.certificateBody;
    }

    @Import(name="certificateChain")
      private final @Nullable Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain == null ? Codegen.empty() : this.certificateChain;
    }

    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Codegen.empty() : this.privateKey;
    }

    @Import(name="serverCertificateName")
      private final @Nullable Output<String> serverCertificateName;

    public Output<String> getServerCertificateName() {
        return this.serverCertificateName == null ? Codegen.empty() : this.serverCertificateName;
    }

    @Import(name="tags")
      private final @Nullable Output<List<ServerCertificateTagArgs>> tags;

    public Output<List<ServerCertificateTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ServerCertificateArgs(
        @Nullable Output<String> certificateBody,
        @Nullable Output<String> certificateChain,
        @Nullable Output<String> path,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> serverCertificateName,
        @Nullable Output<List<ServerCertificateTagArgs>> tags) {
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.path = path;
        this.privateKey = privateKey;
        this.serverCertificateName = serverCertificateName;
        this.tags = tags;
    }

    private ServerCertificateArgs() {
        this.certificateBody = Codegen.empty();
        this.certificateChain = Codegen.empty();
        this.path = Codegen.empty();
        this.privateKey = Codegen.empty();
        this.serverCertificateName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateBody;
        private @Nullable Output<String> certificateChain;
        private @Nullable Output<String> path;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> serverCertificateName;
        private @Nullable Output<List<ServerCertificateTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.path = defaults.path;
    	      this.privateKey = defaults.privateKey;
    	      this.serverCertificateName = defaults.serverCertificateName;
    	      this.tags = defaults.tags;
        }

        public Builder certificateBody(@Nullable Output<String> certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }
        public Builder certificateBody(@Nullable String certificateBody) {
            this.certificateBody = Codegen.ofNullable(certificateBody);
            return this;
        }
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }
        public Builder certificateChain(@Nullable String certificateChain) {
            this.certificateChain = Codegen.ofNullable(certificateChain);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Codegen.ofNullable(privateKey);
            return this;
        }
        public Builder serverCertificateName(@Nullable Output<String> serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }
        public Builder serverCertificateName(@Nullable String serverCertificateName) {
            this.serverCertificateName = Codegen.ofNullable(serverCertificateName);
            return this;
        }
        public Builder tags(@Nullable Output<List<ServerCertificateTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ServerCertificateTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ServerCertificateTagArgs... tags) {
            return tags(List.of(tags));
        }        public ServerCertificateArgs build() {
            return new ServerCertificateArgs(certificateBody, certificateChain, path, privateKey, serverCertificateName, tags);
        }
    }
}
