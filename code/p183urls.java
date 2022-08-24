//Describe what happens when you type a URL into your browser and press enter

public class p183urls {
    /*
     * A single URL can be broken down into its component parts, and each is used to determine how and where a URL goes to a webpage. 
     * 
     * - Starting with the scheme, which 99% of the time will be either HTTP or HTTPS, standing for HyperText Transfer Protocol, with the S standing for Secure. This tells the browser which protocol is needed to access the page. In most modern browsers, this part is not shown in the address bar, usually simplified to a lock or a warning sign for HTTPS and HTTP respectively. HTTP is the old standard, however, it is no longer the standard because it lacks the encryption necessary for more secure connections, so most modern websites default to using HTTPS, whether entered or not. This means that an HTTPS page is connecting to an authentic page, who is who they claim to be. While this does protect from certain security vulnerabilities from unsecure websites, it is still entirely possible for a website to be hacked. 
     * 
     * - The main part of the URL is the authority, combining the domain name and the port. This indicates the web server that is being connected to, sometimes, literally, with the exact IP address and port of the server, although, in general browsing, it is unlikely that this will be used. The domain name can be broken down into three smaller components, the type of server, the host name, and the top-level domain. 
     * -    - In 99.99% of cases, any website that can be visited on the internet will use www. Like with HTTP, this will often be removed from the address bar in your browser automatically, since it does not contain specific information about the host. All it indicates in the modern era is that the following is the web address.
     * -    - After is the host name, which indicates the name of the host of the website visited. Generally, this acts as an abstraction of the exact server IP being connected to, especially for larger services like Google. For hosts that have several IP addresses that one could connect to, it merges them together into a single name and the rest of the URL indicates the rest of the content that needs to be loaded, while the server handles how to get that information.
     * -    - Finally, the top-level domain, of which, there are several types.
     * -    -   - Generic: These include .com, .info, .net and .org, which were created alongside country domains when the URL protocol was first created.
     * -    -   - Country: These indicate which country, sovereign state or territory the site identifies with, such as .us or .uk for United States and United Kingdom sites, or more specific regions like .ca for California sites. 
     * -    -   - Sponsored: These require a sponsor that represents the community being served by the domain. Most often seen with government (.gov) or educational (.edu) websites, but also for more nefarious sites with .xxx
     * -    -   - Infrastructural: These are not seen on outward facing websites and are restricted to the internet infrastructure. In most cases, they end with .arpa.
     * -    -   - Reserved: Domains that are excluded from the general system for any number of reasons. This can be to prevent name collision, especially with shorter domains, or to restrict high-value domains to require application to use. Most non-generic domains are reserved, requiring approval from the operator or registry to be used.
     * -    -   - Testing: These are restricted domains used for internet testing only to remove the possiblity of any conflicts in existing or potential domain names. These end with .test.
     * -    The port indicates the specific gate that is used to connect to the server, although it is typically omitted if the URL is using standard HTTP ports, either 80 for HTTP or 443 for HTTPS. If the server is not using either, then the port must be specified.
     * 
     * - Following is the path to the requested resource. This is structured much like how your system file structure is written, indicating the path required to reach the requested page. In older implementations, this would have indicated the exact file path taken to reach the page, however, in modern websites, it is just an abstraction as it is less likely that a single server contains the information requested. 
     * 
     * - Afterward is any parameters to be used by the web server, although there is no standard way of handling as each server is written to handle different parameters differently. Only the server owners know how the parameters are handled.
     * 
     * - The last part is the anchor. On any given webpage, the creator can set anchor points, where, upon loading, the page will be loaded at the indicated anchor, letting the user start at a point indicated by the link. This is anchor is not sent to the server and is instead handled by the browser upon loading the page. 
     */
}
