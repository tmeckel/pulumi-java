// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.secretmanager_v1.inputs.ReplicationArgs;
import io.pulumi.googlenative.secretmanager_v1.inputs.RotationArgs;
import io.pulumi.googlenative.secretmanager_v1.inputs.TopicArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Optional. Etag of the currently stored Secret.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> getExpireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    @Import(name="replication", required=true)
      private final Output<ReplicationArgs> replication;

    public Output<ReplicationArgs> getReplication() {
        return this.replication;
    }

    /**
     * Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    @Import(name="rotation")
      private final @Nullable Output<RotationArgs> rotation;

    public Output<RotationArgs> getRotation() {
        return this.rotation == null ? Codegen.empty() : this.rotation;
    }

    @Import(name="secretId", required=true)
      private final Output<String> secretId;

    public Output<String> getSecretId() {
        return this.secretId;
    }

    /**
     * Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    @Import(name="topics")
      private final @Nullable Output<List<TopicArgs>> topics;

    public Output<List<TopicArgs>> getTopics() {
        return this.topics == null ? Codegen.empty() : this.topics;
    }

    /**
     * Input only. The TTL for the Secret.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> getTtl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    public SecretArgs(
        @Nullable Output<String> etag,
        @Nullable Output<String> expireTime,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> project,
        Output<ReplicationArgs> replication,
        @Nullable Output<RotationArgs> rotation,
        Output<String> secretId,
        @Nullable Output<List<TopicArgs>> topics,
        @Nullable Output<String> ttl) {
        this.etag = etag;
        this.expireTime = expireTime;
        this.labels = labels;
        this.project = project;
        this.replication = Objects.requireNonNull(replication, "expected parameter 'replication' to be non-null");
        this.rotation = rotation;
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
        this.topics = topics;
        this.ttl = ttl;
    }

    private SecretArgs() {
        this.etag = Codegen.empty();
        this.expireTime = Codegen.empty();
        this.labels = Codegen.empty();
        this.project = Codegen.empty();
        this.replication = Codegen.empty();
        this.rotation = Codegen.empty();
        this.secretId = Codegen.empty();
        this.topics = Codegen.empty();
        this.ttl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> expireTime;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> project;
        private Output<ReplicationArgs> replication;
        private @Nullable Output<RotationArgs> rotation;
        private Output<String> secretId;
        private @Nullable Output<List<TopicArgs>> topics;
        private @Nullable Output<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.replication = defaults.replication;
    	      this.rotation = defaults.rotation;
    	      this.secretId = defaults.secretId;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder replication(Output<ReplicationArgs> replication) {
            this.replication = Objects.requireNonNull(replication);
            return this;
        }
        public Builder replication(ReplicationArgs replication) {
            this.replication = Output.of(Objects.requireNonNull(replication));
            return this;
        }
        public Builder rotation(@Nullable Output<RotationArgs> rotation) {
            this.rotation = rotation;
            return this;
        }
        public Builder rotation(@Nullable RotationArgs rotation) {
            this.rotation = Codegen.ofNullable(rotation);
            return this;
        }
        public Builder secretId(Output<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public Builder secretId(String secretId) {
            this.secretId = Output.of(Objects.requireNonNull(secretId));
            return this;
        }
        public Builder topics(@Nullable Output<List<TopicArgs>> topics) {
            this.topics = topics;
            return this;
        }
        public Builder topics(@Nullable List<TopicArgs> topics) {
            this.topics = Codegen.ofNullable(topics);
            return this;
        }
        public Builder topics(TopicArgs... topics) {
            return topics(List.of(topics));
        }
        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable String ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }        public SecretArgs build() {
            return new SecretArgs(etag, expireTime, labels, project, replication, rotation, secretId, topics, ttl);
        }
    }
}
