// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1.inputs.GkeClusterReferenceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The game server cluster connection information.
 * 
 */
public final class GameServerClusterConnectionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GameServerClusterConnectionInfoResponse Empty = new GameServerClusterConnectionInfoResponse();

    /**
     * Reference to the GKE cluster where the game servers are installed.
     * 
     */
    @InputImport(name="gkeClusterReference", required=true)
      private final GkeClusterReferenceResponse gkeClusterReference;

    public GkeClusterReferenceResponse getGkeClusterReference() {
        return this.gkeClusterReference;
    }

    /**
     * Namespace designated on the game server cluster where the Agones game server instances will be created. Existence of the namespace will be validated during creation.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    public GameServerClusterConnectionInfoResponse(
        GkeClusterReferenceResponse gkeClusterReference,
        String namespace) {
        this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference, "expected parameter 'gkeClusterReference' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private GameServerClusterConnectionInfoResponse() {
        this.gkeClusterReference = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterReferenceResponse gkeClusterReference;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterReference = defaults.gkeClusterReference;
    	      this.namespace = defaults.namespace;
        }

        public Builder gkeClusterReference(GkeClusterReferenceResponse gkeClusterReference) {
            this.gkeClusterReference = Objects.requireNonNull(gkeClusterReference);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public GameServerClusterConnectionInfoResponse build() {
            return new GameServerClusterConnectionInfoResponse(gkeClusterReference, namespace);
        }
    }
}
