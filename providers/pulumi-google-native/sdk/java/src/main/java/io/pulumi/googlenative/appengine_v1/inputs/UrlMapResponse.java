// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.inputs.ApiEndpointHandlerResponse;
import io.pulumi.googlenative.appengine_v1.inputs.ScriptHandlerResponse;
import io.pulumi.googlenative.appengine_v1.inputs.StaticFilesHandlerResponse;
import java.lang.String;
import java.util.Objects;


/**
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript.
 * 
 */
public final class UrlMapResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlMapResponse Empty = new UrlMapResponse();

    /**
     * Uses API Endpoints to handle requests.
     * 
     */
    @InputImport(name="apiEndpoint", required=true)
    private final ApiEndpointHandlerResponse apiEndpoint;

    public ApiEndpointHandlerResponse getApiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @InputImport(name="authFailAction", required=true)
    private final String authFailAction;

    public String getAuthFailAction() {
        return this.authFailAction;
    }

    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    @InputImport(name="login", required=true)
    private final String login;

    public String getLogin() {
        return this.login;
    }

    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    @InputImport(name="redirectHttpResponseCode", required=true)
    private final String redirectHttpResponseCode;

    public String getRedirectHttpResponseCode() {
        return this.redirectHttpResponseCode;
    }

    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example "script": "auto".
     * 
     */
    @InputImport(name="script", required=true)
    private final ScriptHandlerResponse script;

    public ScriptHandlerResponse getScript() {
        return this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    @InputImport(name="securityLevel", required=true)
    private final String securityLevel;

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
     */
    @InputImport(name="staticFiles", required=true)
    private final StaticFilesHandlerResponse staticFiles;

    public StaticFilesHandlerResponse getStaticFiles() {
        return this.staticFiles;
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @InputImport(name="urlRegex", required=true)
    private final String urlRegex;

    public String getUrlRegex() {
        return this.urlRegex;
    }

    public UrlMapResponse(
        ApiEndpointHandlerResponse apiEndpoint,
        String authFailAction,
        String login,
        String redirectHttpResponseCode,
        ScriptHandlerResponse script,
        String securityLevel,
        StaticFilesHandlerResponse staticFiles,
        String urlRegex) {
        this.apiEndpoint = Objects.requireNonNull(apiEndpoint, "expected parameter 'apiEndpoint' to be non-null");
        this.authFailAction = Objects.requireNonNull(authFailAction, "expected parameter 'authFailAction' to be non-null");
        this.login = Objects.requireNonNull(login, "expected parameter 'login' to be non-null");
        this.redirectHttpResponseCode = Objects.requireNonNull(redirectHttpResponseCode, "expected parameter 'redirectHttpResponseCode' to be non-null");
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
        this.securityLevel = Objects.requireNonNull(securityLevel, "expected parameter 'securityLevel' to be non-null");
        this.staticFiles = Objects.requireNonNull(staticFiles, "expected parameter 'staticFiles' to be non-null");
        this.urlRegex = Objects.requireNonNull(urlRegex, "expected parameter 'urlRegex' to be non-null");
    }

    private UrlMapResponse() {
        this.apiEndpoint = null;
        this.authFailAction = null;
        this.login = null;
        this.redirectHttpResponseCode = null;
        this.script = null;
        this.securityLevel = null;
        this.staticFiles = null;
        this.urlRegex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiEndpointHandlerResponse apiEndpoint;
        private String authFailAction;
        private String login;
        private String redirectHttpResponseCode;
        private ScriptHandlerResponse script;
        private String securityLevel;
        private StaticFilesHandlerResponse staticFiles;
        private String urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder setApiEndpoint(ApiEndpointHandlerResponse apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }

        public Builder setAuthFailAction(String authFailAction) {
            this.authFailAction = Objects.requireNonNull(authFailAction);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setRedirectHttpResponseCode(String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Objects.requireNonNull(redirectHttpResponseCode);
            return this;
        }

        public Builder setScript(ScriptHandlerResponse script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setSecurityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }

        public Builder setStaticFiles(StaticFilesHandlerResponse staticFiles) {
            this.staticFiles = Objects.requireNonNull(staticFiles);
            return this;
        }

        public Builder setUrlRegex(String urlRegex) {
            this.urlRegex = Objects.requireNonNull(urlRegex);
            return this;
        }

        public UrlMapResponse build() {
            return new UrlMapResponse(apiEndpoint, authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
