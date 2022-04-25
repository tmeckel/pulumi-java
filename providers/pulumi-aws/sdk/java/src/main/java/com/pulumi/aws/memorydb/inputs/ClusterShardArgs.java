// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.inputs;

import com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterShardArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterShardArgs Empty = new ClusterShardArgs();

    /**
     * Name of this node.
     * * `endpoint`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of this node.
     * * `endpoint`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Set of nodes in this shard.
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<List<ClusterShardNodeArgs>> nodes;

    /**
     * @return Set of nodes in this shard.
     * 
     */
    public Optional<Output<List<ClusterShardNodeArgs>>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    /**
     * Number of individual nodes in this shard.
     * 
     */
    @Import(name="numNodes")
    private @Nullable Output<Integer> numNodes;

    /**
     * @return Number of individual nodes in this shard.
     * 
     */
    public Optional<Output<Integer>> numNodes() {
        return Optional.ofNullable(this.numNodes);
    }

    /**
     * Keyspace for this shard. Example: `0-16383`.
     * 
     */
    @Import(name="slots")
    private @Nullable Output<String> slots;

    /**
     * @return Keyspace for this shard. Example: `0-16383`.
     * 
     */
    public Optional<Output<String>> slots() {
        return Optional.ofNullable(this.slots);
    }

    private ClusterShardArgs() {}

    private ClusterShardArgs(ClusterShardArgs $) {
        this.name = $.name;
        this.nodes = $.nodes;
        this.numNodes = $.numNodes;
        this.slots = $.slots;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterShardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterShardArgs $;

        public Builder() {
            $ = new ClusterShardArgs();
        }

        public Builder(ClusterShardArgs defaults) {
            $ = new ClusterShardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of this node.
         * * `endpoint`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of this node.
         * * `endpoint`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodes Set of nodes in this shard.
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<List<ClusterShardNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes Set of nodes in this shard.
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<ClusterShardNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        /**
         * @param nodes Set of nodes in this shard.
         * 
         * @return builder
         * 
         */
        public Builder nodes(ClusterShardNodeArgs... nodes) {
            return nodes(List.of(nodes));
        }

        /**
         * @param numNodes Number of individual nodes in this shard.
         * 
         * @return builder
         * 
         */
        public Builder numNodes(@Nullable Output<Integer> numNodes) {
            $.numNodes = numNodes;
            return this;
        }

        /**
         * @param numNodes Number of individual nodes in this shard.
         * 
         * @return builder
         * 
         */
        public Builder numNodes(Integer numNodes) {
            return numNodes(Output.of(numNodes));
        }

        /**
         * @param slots Keyspace for this shard. Example: `0-16383`.
         * 
         * @return builder
         * 
         */
        public Builder slots(@Nullable Output<String> slots) {
            $.slots = slots;
            return this;
        }

        /**
         * @param slots Keyspace for this shard. Example: `0-16383`.
         * 
         * @return builder
         * 
         */
        public Builder slots(String slots) {
            return slots(Output.of(slots));
        }

        public ClusterShardArgs build() {
            return $;
        }
    }

}
